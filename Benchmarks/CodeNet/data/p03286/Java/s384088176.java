import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0||n==1)System.out.println(n);
        else {
            n-=2;
            String po="";
            while(n>=0){
                po=((n%4==0)?"10":(n%4==1)?"11":(n%4==2)?"00":"01")+po;
                n/=4;
                n--;
            }
            System.out.println(1+po);
        }
    }
}