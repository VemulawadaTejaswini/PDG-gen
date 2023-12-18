import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num0 = sc.nextInt();
        int num1 = sc.nextInt();
        int i;
        int[] list = new int[num0 + 2];

        for(i = 2;i < num0 + 2;i++){
            list[i] = sc.nextInt();
        }
		    int min = list[2];
		    for (int j = 2; j < num1 + 2; j++) {
			       if (min > list[j]) {
				           min = list[j];
			       }
		    }
        int ans = (num0 - 1) / (num1- 1) + 1;
        System.out.println(ans);
    }

}
