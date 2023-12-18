import java.util.*;
public class Main{

    public static void main(String[] args){
        int i;
        int[] list = new int[Integer.parseInt(args[0]) + 2];
        for(i = 2;i - 2 < Integer.parseInt(args[0]);i++)
        list[i] = Integer.parseInt(args[i]);
		    int min = list[0];
		    for (int j = 2; j < Integer.parseInt(args[0]) + 2; j++) {
			       if (min > list[j]) {
				           min = list[j];
			       }
		    }
        int count = 0;
        for(int k = 0;k < Integer.parseInt(args[0]) + 2;k++){
            if(Integer.parseInt(list[k] == min)){
                count++;
            }
        }
        int ans = (Integer.parseInt(args[0]) - count) / Integer.parseInt(args[1]);
        System.out.println(ans);
    }

}
