import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        int A[] = new int[N];
        int B[] = new int[N];
        AB ab[] = new AB[N];
        int imax = 0;
        int amin = 3000;
        int bmax = 0;
        for (int i=0; i<N; i++) {
            A[i] =  Integer.parseInt(sc.next());
            B[i] =  Integer.parseInt(sc.next());
            if (bmax<B[i]) {
                imax = i;
                amin = A[i];
                bmax = B[i];
            } else if (bmax==B[i]) {
                if (amin>=A[i]) {
                    imax = i;
                    amin = A[i];
                    bmax = B[i];
                }
            }
            ab[i] = new AB(A[i], B[i], i);
        }
        sc.close();
        //System.out.println(imax + " A " + amin + " B " + bmax);

        Arrays.sort(ab, new Comparator<AB>() {
            public int compare(AB ab1, AB ab2) {
                int temp = ab2.getC() - ab1.getC();
                if (temp==0) {
                    temp = ab1.getA() - ab2.getA();
                    if (temp==0) {
                        return ab2.getB() - ab1.getB();
                    }
                }
                return temp;
            }
        });

        int sumA = 0;
        int sumB = 0;
        boolean check = false;
        for (int i=0; i<N; i++) {
            if (imax==ab[i].geti()) {
                check = true;
                continue;
            }
            sumA += ab[i].getA();
            if (sumA>T-1) {
                check = true;
                break;
            }
            sumB += ab[i].getB();
        }
        if (check)
            sumB += bmax;

        System.out.println(sumB);
    }
}

class AB {
    private int A;
    private int B;
    private int C;
    private int i;
    public AB(int A, int B, int i) {
        this.A = A;
        this.B = B;
        this.C = B - A;
        this.i = i;
    }
    public int getA() {
        return A;
    }
    public int getB() {
        return B;
    }
    public int getC() {
        return C;
    }
    public int geti() {
        return i;
    }
}