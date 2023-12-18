import java.util.*;

public class Main {

    int A;
    int B;

    Main(int A,int B){
        this.A=A;
        this.B=B;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long M=sc.nextLong();
        List datalist=new ArrayList();
        int A=0;
        int B=0;
        for(int i=0;i<N;i++){
            A=sc.nextInt();
            B=sc.nextInt();
            Main main=new Main(A,B);
            datalist.add(main);
        }
        long sum=0;
        Collections.sort(datalist, new Comparator<Main>() {
            public int compare(Main student1, Main student2) {
                if(student1.getA() -  student2.getA()<0){
                    return -1;
                }
                return 0;
            }
        });
        for(int i=0;i<datalist.size();i++){
            Main m=(Main)datalist.get(i);
            if(M-m.getB()<=0){
                sum+=m.getA()*M;
                break;

            }else{
                sum+=m.getA()*m.getB();
                M-=m.getB();
            }
        }
        System.out.println(sum);
    }
}
