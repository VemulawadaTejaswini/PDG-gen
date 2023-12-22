import java.util.*;

class Pair{
    int A,B,C;
    Pair(int A,int B,int C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pair> list = new ArrayList<Pair>();
        while(true){
            int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
            if(A==-1&&B==-1&&C==-1){
                break;
            }
            Pair p = new Pair(A,B,C);
            list.add(p);
        }
        for(int i=0;i<list.size();i++){
            Pair p = list.get(i);
            if(p.A==-1||p.B==-1){
                System.out.println("F");
            }else if(p.A + p.B>=80){
                System.out.println("A");
            }else if(p.A + p.B>=65 && p.A + p.B < 80){
                System.out.println("B");
            }else if(p.A + p.B>=50 && p.A + p.B < 65){
                System.out.println("C");
            }else if(p.A + p.B>=30 && p.A + p.B < 50){
                if(p.C >= 50){
                    System.out.println("C");
                }else{
                    System.out.println("D");
                }
            }else{
                System.out.println("F");
            }
        }
    }
}

