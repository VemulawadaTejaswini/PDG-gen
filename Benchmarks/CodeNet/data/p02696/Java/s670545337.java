import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int temp = 0;
        for(int i=0;true;i++){
            int front=(A*i)/B;
            int back=i/B;
            if(temp<=(front-A*back))
                temp=front-A*back;
            else break;
        }
        System.out.println(temp);
    }
}