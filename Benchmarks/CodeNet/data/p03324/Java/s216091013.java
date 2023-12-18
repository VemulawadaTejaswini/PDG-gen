import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(),n=sc.nextInt();
        long start = 0;
        if(d==0){
            start = 1;
        }else if(d==1){
            start = 100;
        }else {
            start = 10000;
        }
        System.out.println(start*n);
    }
}
