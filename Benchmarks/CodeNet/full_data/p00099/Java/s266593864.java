import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//?????°??¨??????????????°???????????????
		int people = sc.nextInt();
		int ivent = sc.nextInt();

		int num = Integer.MAX_VALUE;

		//?????°??????????????????
		int[] wakasagi = new int[people+1];
		Arrays.fill(wakasagi, 0);

		int max = 0;
		//????????¨???
		for(int $ = 0; $ < ivent; $++) {
			int entryNum = sc.nextInt(); //?????????????????????
			int wakasagiNum = sc.nextInt(); //?????????????????°


			wakasagi[entryNum] += wakasagiNum;

			if(num == entryNum){
                max = 0;
                for(int i = 1;i <= people; i++) max = Math.max(max, wakasagi[i]);
                for(int i = 1;i <= people; i++){
                    if(wakasagi[i] == max){
                        num = i;
                        System.out.println(num + " " + max);
                        break;
                    }
                }
            }else{

                if(max > wakasagi[entryNum]){
                    System.out.println(num + " " + max);
                }else if(max < wakasagi[entryNum]){
                    max = wakasagi[entryNum];
                    num = entryNum;
                    System.out.println(num + " " + max);
                }else if(max == wakasagi[entryNum]){
                    if(num < entryNum){
                        System.out.println(num + " " + max);
                    }else{
                        num = entryNum;
                        System.out.println(num + " " + max);
                    }
                }

            }


		}
	}
}