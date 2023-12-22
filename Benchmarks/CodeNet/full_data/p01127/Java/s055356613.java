import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {
    static final ByteBuffer buf = ByteBuffer.allocate(1000000);
    static final ReadableByteChannel in = Channels.newChannel(System.in);
    static final int NAME = 0;
    static final int T = 1;// top;
    static final int B = 2;// Bottom;
    static final int L = 3;// left;
    static final int R = 4;// right;
    static final int UNDERS = 5;

    public static void main(String[] args) throws IOException {
	init();
	int n = getInt();
	for (int i = 0; i < n; i++) {
	    int h = getInt();
	    int w = getInt();
	    byte[][] box = new byte[h][w];
	    int[][] item = new int[7][6];
	    int count = 0;
	    for (int y = 0; y < h; y++) {
		getLine(box[y]);
		for (int x = 0; x < w; x++) {
		    final byte c = box[y][x];
		    if (c != '.') {
			for (int k = 0; k < 7; k++) {
			    if (item[k][NAME] == 0) {
				item[k][NAME] = c;
				item[k][T] = item[k][B] = y;
				item[k][L] = item[k][R] = x;
				count++;
				break;
			    } else if (item[k][NAME] == c) {
				if (item[k][B] != y) {
				    item[k][B] = y;
				}
				if (x < item[k][L]) {
				    item[k][L] = x;
				} else if (item[k][R] < x) {
				    item[k][R] = x;
				}
				break;
			    }
			}
		    }
		}
	    }
	    boolean isSUSPICIOUS = false;
	    for (int num = 0; !isSUSPICIOUS && num < count; num++) {
		for (int y = item[num][T]; !isSUSPICIOUS && y <= item[num][B]; y++) {
		    for (int x = item[num][L]; !isSUSPICIOUS
			    && x <= item[num][R]; x++) {
			final byte parts = box[y][x];
			if (parts != item[num][NAME]) {
			    if (parts == '.') {
				isSUSPICIOUS = true;
			    } else {
				int partsNum;
				for (int j = 0; j < count; j++) {
				    if (item[j][0] == parts) {
					partsNum = j;
					isSUSPICIOUS = !setUnders(item, num,
						partsNum);
					break;
				    }
				}
			    }

			}
		    }
		}
	    }
	    System.out.println(isSUSPICIOUS ? "SUSPICIOUS" : "SAFE");

	}

    }

    private static boolean setUnders(int[][] item, int num, int partsNum) {
	if (num == partsNum) {
	    return false;
	}
	for (int i = 0; i < 7; i++) {
	    if ((item[num][UNDERS] & getLayer(i)) != 0) {
		if (!setUnders(item, i, partsNum)) {
		    return false;
		}
	    }
	}
	item[partsNum][UNDERS] |= getLayer(num);
	return true;
    }

    static int getLayer(int i) {
	return 1 << i;
    }

    static void init() throws IOException {
	buf.clear();
	in.read(buf);
	buf.flip();
    }

    static int getInt() {
	byte b = buf.get();
	while (b < '0' || '9' < b) {
	    b = buf.get();
	}
	int result = 0;
	while ('0' <= b && b <= '9') {
	    result = result * 10 + (b - '0');
	    b = buf.get();
	}
	return result;
    }

    static void getLine(byte[] array) {
	byte b = buf.get();
	while (b != '.' && (b < 'A' || 'Z' < b)) {
	    b = buf.get();
	}
	buf.position(buf.position() - 1);
	buf.get(array);
    }
}