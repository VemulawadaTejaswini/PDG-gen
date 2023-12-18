import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), b1 = sc.nextInt(), b2 = sc.nextInt();
        int a2, a3, b3, c1, c2, c3, A, B, C, X, Y, Z, P, Q;
        int N;
        a2 = a3 = b3 = c1 = c2 = c3 = 0;
        for(int i = 300; i > 0; i--){
            c1 = i - a1 - b1;
            b3 = i - b1 - b2;
            c3 = i - a1 - b2;
            c2 = i - c1 - c3;
            a2 = i - b2 - c2;
            a3 = i - b3 - c3;
            A = a1 + a2 + a3;
            B = b1 + b2 + b3;
            C = c1 + c2 + c3;
            X = a1 + b1 + c1;
            Y = a2 + b2 + c2;
            Z = a3 + b3 + c3;
            P = a1 + b2 + c3;
            Q = a3 + b2 + c1;
            if(A == B && B == C && C ==  X && X == Y && Y == Z && Z == P && P == Q)
                break;
        }
        System.out.println(a1 + " " + b1 + " " + c1);
        System.out.println(a2 + " " + b2 + " " + c2);
        System.out.println(a3 + " " + b3 + " " + c3);
    }
}