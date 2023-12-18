import java.util.*;
class Main{
    static{
        Scanner sc=new Scanner(System.in);
        long k=sc.nextLong();
        for(int i=0;i<51;i++) System.out.print(i<1?50:(k/50+(i<50-k%50?49:100)-k%50)+" ");
        System.exit(0);
    }
}