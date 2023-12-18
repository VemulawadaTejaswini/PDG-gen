import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		
		long x = 0;
		int digit = 0;
		while(true) {
			digit++;
			x *= 10;
			
			System.out.println("? " + (x+5));
			if(sc.next().equals("Y")) {
				System.out.println("? " + (x+9));
				if(sc.next().equals("Y")) {
					//x9xxxx or x0-x4 or (x/10)(5-8) or (x/10)(9)
					long y = (x+8) * (long)Math.pow(10, 10 - digit);
					System.out.println("? " + y);
					if(sc.next().equals("Y")) {
						//x0-x4 or (x/10)(5-8)
						System.out.println("? " + ((x/100)*10 + 9));
						if(sc.next().equals("Y")) {
							//System.out.println("? " + y);
							System.out.println("! " + (x/10));
							return;
							
							
						} else {
							y = (x+4) * (long)Math.pow(10, 10 - digit);
							System.out.println("? " + y);
							if(sc.next().equals("Y")) {
								//x0-x4
								y = (x+1) * (long)Math.pow(10, 10 - digit);
								System.out.println("? " + y);
								if(sc.next().equals("Y")) {
									//x0-x1
									y = (x) * (long)Math.pow(10, 10 - digit);
									System.out.println("? " + y);
									if(sc.next().equals("Y")) {
										//x0
										System.out.println("! " + x);
										return;
									} else {
										//x1
										System.out.println("! " + (x+1));
										return;
									}
								} else {
									y = (x+2) * (long)Math.pow(10, 10 - digit);
									System.out.println("? " + y);
									//x2-x4
									if(sc.next().equals("Y")) {
										//x2
										System.out.println("! " + (x+2));
										return;
									} else {
										y = (x+3) * (long)Math.pow(10, 10 - digit);
										System.out.println("? " + y);
										//x3-x4
										if(sc.next().equals("Y")) {
											//x3
											System.out.println("! " + (x+3));
											return;
										} else {
											//x4
											System.out.println("! " + (x+4));
											return;
										}
									}
								}
							} else {
								//x0-x4
								y = (x+6) * (long)Math.pow(10, 10 - digit);
								System.out.println("? " + y);
								if(sc.next().equals("Y")) {
									//x0-x1
									y = (x+5) * (long)Math.pow(10, 10 - digit);
									System.out.println("? " + y);
									if(sc.next().equals("Y")) {
										//x0
										System.out.println("! " + (x+5));
										return;
									} else {
										//x1
										System.out.println("! " + (x+6));
										return;
									}
								} else {
									y = (x+7) * (long)Math.pow(10, 10 - digit);
									System.out.println("? " + y);
									//x2-x4
									if(sc.next().equals("Y")) {
										//x2
										System.out.println("! " + (x+7));
										return;
									} else {
										y = (x+8) * (long)Math.pow(10, 10 - digit);
										System.out.println("? " + y);
										//x3-x4
										if(sc.next().equals("Y")) {
											//x3
											System.out.println("! " + (x+8));
											return;
										} else {
											//x4
											System.out.println("! " + (x+9));
											return;
										}
									}
								}
							}
							
						}
					} else {
						//9 or (x/10)(9)
						System.out.println("? " + (x/10 - 1)*10);
						if(sc.next().equals("Y")) {
							//9
							x += 9;
						} else {
							//(x/10)(9)
							System.out.println("! " + (x/10));
							return;
						}
					}
				} else {
					//5-8
					System.out.println("? " + (x+7));
					if(sc.next().equals("Y")) {
						//7-8
						System.out.println("? " + (x+8));
						if(sc.next().equals("Y")) {
							x += 8;
						} else {
							x += 7;
						}
					} else {
						//5-6
						System.out.println("? " + (x+6));
						if(sc.next().equals("Y")) {
							x += 6;
						} else {
							x += 5;
						}
					}
				}
			} else {
				System.out.println("? " + (x+1));
				if(sc.next().equals("Y")) {
					//1-4
					System.out.println("? " + (x+3));
					if(sc.next().equals("Y")) {
						//3-4
						System.out.println("? " + (x+4));
						if(sc.next().equals("Y")) {
							x += 4;
						} else {
							x += 3;
						}
					} else {
						//1-2
						System.out.println("? " + (x+2));
						if(sc.next().equals("Y")) {
							x += 2;
						} else {
							x += 1;
						}
					}
				} else {
					//0
				}
			}
		}
	}
	
	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}