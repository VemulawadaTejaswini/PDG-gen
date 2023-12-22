import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   //可変長配列要素数
        int q = sc.nextInt();   //クエリ数

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); //可変長配列
        for(int i = 0;i < n;i++){   //初期化
            list.add(new ArrayList<>());
        }

        int num,t;    //命令番号、指定された配列要素番号
        for(int i = 0;i < q;i++){
            num = sc.nextInt();
            t = sc.nextInt();

            switch(num){
                case 0: //pushBack
                    int x = sc.nextInt();   //整数x
                    list.get(t).add(x);
                    break;
                case 1: //dump
                    for(int j = 0;j < list.get(t).size();j++){
                        if(j != 0)  System.out.print(" ");
                        System.out.print(list.get(t).get(j));
                    }
                    System.out.println();
                    break;
                case 2: //clear
                    list.get(t).clear();
                    break;
            }
        }
    }
}

