import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge = sc.nextInt();
        int[] array = new int[hoge];
        int sum = 0;
        int sum2 = 0;
        int num = 0;
        int count = 0;
        for(int i = 0; i < hoge; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        /*if(sum % 2 != 0){
            sum--;
        }*/
        for(int i = 0; i < hoge; i++){
            num += array[i];
            if(num > (sum/2)){
                if(Math.abs(num-sum/2) <= Math.abs(sum/2 - (num-array[i]))){
                    while(num != (sum/2)){
                        num--;
                        count++;
                    }
                    for(int j = i + 1; j < hoge; j++){
                        sum2 += array[j];
                    }
                    while(sum2 != (sum/2)){
                        sum2++;
                        count++;
                    }    
                    break;
                }else{
                    num -= array[i];
                    i--;
                    while(num != (sum/2)){
                        num++;
                        count++;
                    }
                    for(int j = i + 1; j < hoge; j++){
                        sum2 += array[j];
                    }
                    while(sum2 != (sum/2)){
                        sum2--;
                        count++;
                    }
                       
                    break;
                }           
            }else if((double)num == ((double)sum/2)){
                break;
            }
        }
        System.out.println(count);
    }     
}