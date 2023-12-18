import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        while(A>=0||C>=0){
            A=A-D;
          	if(A<=0)
              	break;
            C=C-B;
        }
      	//System.out.println(A+" "+C);
        if(A<=0)
            System.out.println("No");
        if(C<=0)
            System.out.println("Yes");
    }
}