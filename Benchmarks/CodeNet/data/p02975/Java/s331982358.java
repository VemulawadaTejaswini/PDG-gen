import java.util.Scanner;
import java.util.ArrayList;

class Main{
    static ArrayList<Integer> caps = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int camelNum = sc.nextInt();
        String result = "No";

        for(int i = 0; i < camelNum; i++){
            caps.add(sc.nextInt());
        }

        //初期値
        loop : for(int i = 0; i < camelNum; i++){
            for(int j = i+1; j < camelNum; j++){
                int left = caps.get(i);
                int right = caps.get(j);
                int xor = left ^ right;
                int index;
                if((index = caps.indexOf(xor)) > -1){
                    swap(0, i);
                    swap(1, index);
                    swap(2, j);
                    result = "Yes";
                    //4匹目以降
                    for(int k = 1; k < camelNum-2; k++){
                        left = caps.get(k);
                        right = caps.get(k+1);
                        xor = left ^ right;
                        if((index = caps.indexOf(xor)) > -1){
                            swap(i+2, index);
                        }else{
                            result = "No";
                            break;
                        }
                    }
                    break loop;
                }
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