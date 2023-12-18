import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i = 0;i<num.length;i++)num[i] = sc.nextInt();
        Arrays.sort(num);
        int count = 0;
        count += (num[1]-num[0])/2+(num[1]-num[0])%2;
        num[2]+= (num[1]-num[0])%2;
        count+= num[2]-num[1];
        System.out.println(count);
    }
}
