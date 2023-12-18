import java.util.*;
public class Main {
    static Long A,B,C;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = sc.nextLong();
        B = sc.nextLong();
        C = sc.nextLong();
        List<String> lt = new ArrayList<>();
        for(int i=0;i<N;i++){
            String s = sc.next();
            lt.add(s);
        }

        StringBuilder bld = new StringBuilder();
        for(int i=0;i<N;i++){
            String op = lt.get(i);
            if(op.equals("AB")){
                if(A == 0 && B == 0) {
                    System.out.println("No");
                    return;
                }else if(A == 0){
                    operate(op, "A",A,B,C,bld);
                }else if(B == 0){
                    operate(op, "B",A,B,C,bld);
                }else{
                    if(A>B){
                        operate(op, "B",A,B,C,bld);
                    }else if(A<B){
                        operate(op, "A",A,B,C,bld);
                    }else{
                        if(A+B==2 && i != N-1){
                            String next = lt.get(i+1);
                            if(next.equals("BC")){
                                operate(op, "B",A,B,C,bld);
                            }else if(next.equals("AC")){
                                operate(op, "A",A,B,C,bld);
                            }else{
                                operate(op, "A",A,B,C,bld);
                            }
                        }else{
                            operate(op, "A",A,B,C,bld);
                        }
                    }
                }
            }else if(op.equals("BC")){
                if(B == 0 && C == 0) {
                    System.out.println("No");
                    return;
                }else if(B == 0){
                    operate(op, "B",A,B,C,bld);
                }else if(C == 0){
                    operate(op, "C",A,B,C,bld);
                }else{
                    if(B>C){
                        operate(op, "C",A,B,C,bld);
                    }else if(B<C){
                        operate(op, "B",A,B,C,bld);
                    }else{
                        if(B+C==2 && i != N-1){
                            String next = lt.get(i+1);
                            if(next.equals("AC")){
                                operate(op, "C",A,B,C,bld);
                            }else if(next.equals("AB")){
                                operate(op, "B",A,B,C,bld);
                            }else{
                                operate(op, "B",A,B,C,bld);
                            }
                        }else{
                            operate(op, "B",A,B,C,bld);//either
                        }
                    }
                }
            } else if(op.equals("AC")){
                if(A == 0 && C == 0) {
                    System.out.println("No");
                    return;
                }else if(A == 0){
                    operate(op, "A",A,B,C,bld);
                }else if(C == 0){
                    operate(op, "C",A,B,C,bld);
                }else{
                    if(A>C){
                        operate(op, "C",A,B,C,bld);
                    }else if(A<C){
                        operate(op, "A",A,B,C,bld);
                    }else{
                        if(A+C==2 && i != N-1){
                            String next = lt.get(i+1);
                            if(next.equals("AB")){
                                operate(op, "A",A,B,C,bld);
                            }else if(next.equals("BC")){
                                operate(op, "C",A,B,C,bld);
                            }else{
                                operate(op, "C",A,B,C,bld);
                            }
                        }else{
                            operate(op, "C",A,B,C,bld);
                        }
                    }
                }
            }
            //System.out.println(A + " " + B + " " + C);
        }
        System.out.println("Yes");
        System.out.print(bld.toString());
    }

    private static void operate(String s, String op,Long a, Long b, Long c, StringBuilder bld){
        if(s.equals("AB")){
            if(op.equals("A")){
                A++;
                B--;
            }else{
                A--;
                B++;
            }
        }
        if(s.equals("BC")){
            if(op.equals("B")){
                B++;
                C--;
            }else{
                B--;
                C++;
            }
        }
        if(s.equals("AC")){
            if(op.equals("A")){
                A++;
                C--;
            }else{
                A--;
                C++;
            }
        }
        bld.append(op);
        bld.append("\n");
    }

}
