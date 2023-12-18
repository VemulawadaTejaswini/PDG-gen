import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        int A[] = new int[N];
        int B[] = new int[N];
        AB ab[] = new AB[N];
        for (int i=0; i<N; i++) {
            A[i] =  Integer.parseInt(sc.next());
            B[i] =  Integer.parseInt(sc.next());
            ab[i] = new AB(A[i], B[i]);
        }
        sc.close();

        Arrays.sort(ab, new Comparator<AB>() {
            public int compare(AB ab1, AB ab2) {
                int temp = ab1.getA() - ab2.getA();
                if (temp==0) {
                    return ab2.getB() - ab1.getB();
                }
                return temp;
            }
        });

        int sumA = 0;
        int sumB = 0;
        for (int i=0; i<N; i++) {
            sumA += ab[i].getA();
            sumB += ab[i].getB();
            if (sumA>=T)
                break;
        }

        System.out.println(sumB);
    }
}

class AB {
    private int A;
    private int B;
    public AB(int A, int B) {
        this.A = A;
        this.B = B;
    }
    public int getA() {
        return A;
    }
    public int getB() {
        return B;
    }
    public void setA(int A) {
        this.A = A;
    }
    public void setB(int B) {
        this.B = B;
    }
}