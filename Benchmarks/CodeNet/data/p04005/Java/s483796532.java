import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] side = new int[3];
        for(int i = 0;i<side.length;i++) side[i] = sc.nextInt();
        if(side[0]%2==0||side[1]%2==0||side[2]%2==0){
            System.out.println(0);
        } else {
            System.out.println(Math.min(side[0]*side[1],Math.min(side[1]*side[2],side[2]*side[0])));
        }
    }
}
