import java.util.*;

class Main{

    int n,m;
    int a,b;
    Main(){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            n--;
            a=sc.nextInt();
            b=sc.nextInt();
            m=a%b;
            if(m==0)m=b;
            System.out.println(m);
        }


    }

    public static void main(String[] args){
        new Main();
    }
}