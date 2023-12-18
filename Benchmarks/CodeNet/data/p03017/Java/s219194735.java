import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int A = sc.nextInt(); //すぬけ初期位置
		int B = sc.nextInt(); //ふぬけ初期位置
		int C = sc.nextInt(); //すぬけゴール
		int D = sc.nextInt(); //ふぬけゴール
		String S = sc.next();

		String[] sarray = S.split("");
		boolean success =true;
		try {
			test(N,A,B,C,D,sarray);
		}catch (ArrayIndexOutOfBoundsException e) {
			success = false;
		}
		if(success) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	private static void test(int N, int A, int B, int C, int D, String[] sarray) {
		while(A != C || B != D) {
			if(C > D) {
				//逆転を目指すべきなのにまだ追い抜かしてない(すぬけを優先して動かす)
				if(A >= C) {
					if(B >= D) {
						//この時点でもう終わってる
						break;
					}else if(sarray[B].equals("#") || B+1 == A) {
						if(sarray[B+1].equals(".") &&  B + 2 != A) {
							B = B + 2;
						}else if(B+2 == A || sarray[B+1].equals("#")){
							continue;
						}
					}else {
						B = B + 1;
					}
				} else if(sarray[A].equals("#") || A+1 == B) {
					if(sarray[A+1].equals(".") && A + 2 != B) {
						A = A + 2;
					}else if(A+2 == B || sarray[A+1].equals("#")){
						if(B >= N) {
							//この時点でもう終わってる
							break;
						}else if(sarray[B].equals("#") || B+1 == A) {
							if(sarray[B+1].equals(".") && B + 2 != A) {
								B = B + 2;
							}else if(B+2 == A || sarray[B+1].equals("#")){
								continue;
							}
						}else {
							B = B + 1;
						}
					}
				}else {
					A = A + 1;
				}
			}else {
				//Bを先に進める
				if(B >= D) {
					//TODO Aを進める
					if(A >= C) {
						//この時点でもう終わってる
						break;
					}else if(sarray[A].equals("#") || A+1 == B) {
						if(sarray[A+1].equals(".") && A + 2 != B) {
							A = A + 2;
						}else if(A+2 == B || sarray[A+1].equals("#")){
							continue;
						}
					}else {
						A = A + 1;
					}
				}else if(sarray[B].equals("#") || B+1 == A) {
					if(sarray[B+1].equals(".") && B + 2 != A) {
						B = B + 2;
					}else if(B+2 == A || sarray[B+1].equals("#")){
						if(A >= N) {
							//この時点でもう終わってる
							break;
						}else if(sarray[A].equals("#") || A+1 == B) {
							if(sarray[A+1].equals(".") && A + 2 != B) {
								A = A + 2;
							}else if(A+2 == B || sarray[A+1].equals("#")){
								continue;
							}
						}else {
							A = A + 1;
						}
					}
				}else {
					B = B + 1;
				}
			}
		}
	}
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}