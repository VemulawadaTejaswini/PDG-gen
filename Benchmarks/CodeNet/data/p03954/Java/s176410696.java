

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<2*N-1;i++){
            list.add(sc.nextInt());
        }

        List<Integer> tmpList = new ArrayList<>();
        for(int i=N;i>0;i--){
            tmpList.clear();
            for(int j=0;j<2*i-1-2;j++){
               // System.out.println(j);
                int num1 = list.get(j);
                int num2 = list.get(j+1);
                int num3 = list.get(j+2);
                if(num1>=num2){
                    if(num1<=num3){
                        tmpList.add(num1);
                    }
                    else{
                        if(num2>=num3){
                            tmpList.add(num2);
                        }
                        else{
                            tmpList.add(num3);
                        }
                    }
                }
                else{
                    if(num1>=num3){
                        tmpList.add(num1);
                    }
                    else{
                        if(num2<=num3){
                            tmpList.add(num2);
                        }
                        else{
                            tmpList.add(num3);
                        }
                    }
                }
            }
            if(tmpList.size()>0) {
                list.clear();
                list.addAll(tmpList);
            }
        }

        System.out.println(list.get(0));


        sc.close();

    }

 }
