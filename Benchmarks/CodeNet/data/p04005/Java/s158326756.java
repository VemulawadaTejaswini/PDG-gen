import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] side = new int[3];
        for(int i = 0;i<side.length;i++) side[i] = sc.nextInt();
        if(side[0]%2==0||side[1]%2==0||side[2]%2==0){
            System.out.println(0);
        } else {
            long a = side[0]*side[1],b=side[1]*side[2],c=side[2]*side[0];
            if(a<b&&a<c){
                System.out.println(a);
            } else if(b<a&&b<c){
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
