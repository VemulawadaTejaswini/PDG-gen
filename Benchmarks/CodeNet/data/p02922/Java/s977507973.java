import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int i = 1;
int n =0;
if(a == b){
n = 1;
}else{
n = b / (a -1) + 1;
}
System.out.println(n);



        sc.close();
    }
}
