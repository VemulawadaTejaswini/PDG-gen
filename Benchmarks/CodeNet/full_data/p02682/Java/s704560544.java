import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Long a= sc.nextLong();
        Long b= sc.nextLong();
        Long c= sc.nextLong();
        Long n= sc.nextLong();
        Long temp = n-a-b;
        if(temp<1){
            System.out.println(a);
        }else{
            System.out.println(a-temp); 
        }


    }
}