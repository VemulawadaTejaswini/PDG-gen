import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int[] list = new int[nums];
        for(int i = 0; i < nums; i++){
            int num =  sc.nextInt();
            list[i]= num;
        }
        Arrays.sort(list);
        System.out.println(nums);
        for (int k= 2; k <= nums ; k++) {
            int[] copied = Arrays.copyOfRange(list, 0, list.length);
            int count = eatCards(k, copied);
            Arrays.sort(list);
            System.out.println(count);
        }
    }

    public static int eatCards(int k, int[] list){
        int counter = 0;
        for (int j = 0; j < list.length; j++) {
            int num = k;
            if(list[j]!=-1){
                int first = list[j];
                list[j] = -1;
                num--;
                for(int i= j + 1; i < list.length; i++) {
                    if (first != list[i]) {
                        num--;
                        first = list[i];
                        list[i] = -1;
                        if(num == 0){
                            counter++;
                            break;
                        }
                    }
                }
            }
        }
        return  counter;
    }
}
