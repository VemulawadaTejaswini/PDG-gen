import java.util.*;
 
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    if(A==2 && B==2){
    	System.out.println("Yes");
    }else if(A==2 && B!=2){
        System.out.println("No");
}
    if(A==4 || A==6 || A==9 || A==11){
        if(B==4 || B==6 || B==9 || B==11){
        System.out.println("Yes");
    }else if(A==4 || A==6 || A==9 || A==11){
        if(B!=4 || B!=6 || B!=9 || B!=11){
        System.out.println("No");
    }
}
}
    if(A==1 || A==3 || A==5 || A==7 || A==8 || A==10 || A==12){
        if(B==1 || B==3 || B==5 || B==7 || B==8 || B==10 || B==12){
        System.out.println("Yes");
    }else if(A==1 || A==3 || A==5 || A==7 || A==8 || A==10 || A==12){
        if(B!=1 || B!=3 || B!=5 || B!=7 || B!=8 || B!=10 || B!=12){
        System.out.println("No");
        }
    }
    }
}
}
