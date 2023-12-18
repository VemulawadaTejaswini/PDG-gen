import java.util.Scanner;
import java.util.ArrayList;

class Main{
    static ArrayList<Integer> caps = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int camelNum = sc.nextInt();
        String result = "Yes";

        for(int i = 0; i < camelNum; i++){
            caps.add(sc.nextInt());
        }

        for(int i = 0; i < camelNum-2; i++){
            int left = caps.get(i);
            int right = caps.get(i+1);
            int xor = left ^ right;
            int index;
            if((index = caps.indexOf(xor)) > -1){
                swap(i+2, index);
            }else{
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }

    static void swap(int i, int j){
        int tmp = caps.get(i);
        caps.set(i,caps.get(j));
        caps.set(j,tmp);
    }
}