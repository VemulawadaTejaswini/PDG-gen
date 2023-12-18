import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
	public static void main (String[] args) {
		// your code goes here
        final Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int K = scanner.nextInt();
        final Request[]requests = new Request[N];
        for (int i = 0; i < N; i++) {
            final int x = scanner.nextInt();
            final int y = scanner.nextInt();
            final String colorMark = scanner.next();
            requests[i] = new Request(x, y, colorMark);
        }

        int maxMatch = 0;
        for (int xShift = 0; xShift < 2 * K; xShift++) {
            for (int yShift = 0; yShift < 2 * K; yShift++) {
                final Pattern pat = new Pattern(K, xShift, yShift);
                final int match = (int) Arrays.stream(requests)
                        .filter(pat::match)
                        .count();
                if (match > maxMatch) {
                    maxMatch = match;
                }
            }
        }
        System.out.println(maxMatch);

	}
}
class Pattern {
    final int size;
    final int xShift;
    final int yShift;
    Pattern(final int size, final int xShift, final int yShift) {
        this.size = size;
        this.xShift = xShift % (2 * size);
        this.yShift = yShift % (2 * size);
    }
    Color getColorAt(final int x, final int y) {
        final int revertedX = (2 * size - xShift + x) % (2 * size);
        final int revertedY = (2 * size - yShift + y) % (2 * size);
        if (revertedX < size && revertedY < size) {
            return Color.WHITE;
        } else if (revertedX >= size && revertedY < size) {
            return Color.BLACK;
        } else if (revertedX < size && revertedY >= size) {
            return Color.BLACK;
        } else {
            return Color.WHITE;
        }
    }
    boolean match(final Request request) {
        final Color col = getColorAt(request.x, request.y);
        return col == request.color;
    }
}
class Request {
    final int x;
    final int y;
    final Color color;
    Request(final int x, final int y, final String colorMark) {
        this.x = x;
        this.y = y;
        final Color color = Color.byMark(colorMark);
        Objects.requireNonNull(color);
        this.color = color;
    }
    @Override
    public String toString() {
        return "Request (x = " + x + ", y = " + y + ", color = " + color + ")";
    }
    
}
enum Color {
    BLACK("B"),
    WHITE("W"),
    ;
    private static final Map<String, Color> MARK_MAP;
    static {
        final Map<String, Color> markMap = new HashMap<>();
        for (final Color col : values()) {
            markMap.put(col.mark, col);
        }
        MARK_MAP = Collections.unmodifiableMap(markMap);
    }
    final String mark;
    Color(final String mark) {
        this.mark = mark;
    }
    static Color byMark(final String mark) {
        return MARK_MAP.get(mark);
    }
}

