import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int i = 0;i < t;i++){
           card c[] = new card[9];
           card nc[] = new card[9];

            for(int j = 0;j < 9;j++){
                c[j] = new card();
                nc[j] = new card();
                c[j].number = scan.nextInt();
            }
            for(int j = 0;j < 9;j++)c[j].color = scan.next();
            int count = 0;
            for(int j = 0;j < 9;j++){
                if(c[j].color.equals("R")){
                    nc[count].number = c[j].number;
                    nc[count].color = c[j].color;
                    count++;
                }
            }
            for(int j = 0;j < 9;j++){
                if(c[j].color.equals("G")){
                    nc[count].number = c[j].number;
                    nc[count].color = c[j].color;
                    count++;
                }
            }
            for(int j = 0;j < 9;j++){
                if(c[j].color.equals("B")){
                    nc[count].number = c[j].number;
                    nc[count].color = c[j].color;
                    count++;
                }
            }
            if(!(nc[0].color.equals(nc[1].color)&&nc[1].color.equals(nc[2].color)
            &&nc[3].color.equals(nc[4].color)&&nc[4].color.equals(nc[5].color)
            &&nc[6].color.equals(nc[7].color)&&nc[7].color.equals(nc[8].color))){
                System.out.println(0);
                continue;
            }

            if(nc[2].color.equals(nc[3].color)){
                if(nc[5].color.equals(nc[6].color)){
                    if(ifWin(pickNum(nc, 0, 9))){
                        System.out.println(1);
                        continue;
                    }else{
                        System.out.println(0);
                        continue;
                    }
                }else{
                    if(ifWin(pickNum(nc, 0, 6)) && 
                    ifWin(pickNum(nc, 6, 9))){
                        System.out.println(1);
                        continue;
                    }else{
                        System.out.println(0);
                        continue;
                    }
                }
            }else{
                if(nc[5].color.equals(nc[6].color)){
                    if(ifWin(pickNum(nc, 0, 3)) &&
                     ifWin(pickNum(nc, 3, 9))){
                        System.out.println(1);
                        continue;
                    }else{
                        System.out.println(0);
                        continue;
                    }
                }else{
                    if(ifWin(pickNum(nc, 0, 3)) && ifWin(pickNum(nc, 3, 6)) && ifWin(pickNum(nc, 6, 9))){
                        System.out.println(1);
                        continue;
                    }else{
                        System.out.println(0);
                        continue;
                    }
                }
            }


        }
        scan.close();
    }

    static int[] pickNum(card c[], int begin, int end){
        int num[] = new int [end - begin];
        for(int i = 0;i < end - begin;i++)num[i] = c[i+begin].number;
        return num;
    }

    static boolean three(int num[]){
        sort(num);
        
        return (num[0] == num[1] && num[1] == num[2]) || (num[0] == num[1]-1 && num[1] == num[2]-1);
    }


    static boolean ifWin(int num[]){
        if(num.length == 3)return three(num);
        sort(num);
        int n;
        ArrayList<Integer> list; 
        for(int i = 0;i < num.length;i++){
            list = new ArrayList<>();
            n = num[i];
            list.add(i);
            for(int j = i;j < num.length;j++){
                if(n+1 == num[j]){
                    n++;
                    list.add(j);
                    if(list.size() == 3){
                        int newnum[] = new int[num.length-3];
                        int count = 0;
                        for(int k = 0;k < num.length;k++){
                            if(!list.contains((Integer)k)){
                                newnum[count] = num[k];
                                count++;
                            }
                        }
                        return ifWin(newnum);
                    }
                }
            }
        }
        int count = 0;
        int newnum[] = {};
        for(int i = 0;i < num.length;i++){
            if(count == 0)newnum = new int[3];
            newnum[count] = num[i];
            count++;
            if(count == 3){
                if(three(newnum))count = 0;
                else return false;
            }
        }
        return true;
    }

    static void sort(int num[]){
        for(int i = 0;i < num.length;i++){
            int min = i;
            for(int j = i+1;j < num.length;j++)
                if(num[min] > num[j]) min = j;
            
            int x = num[i];
            num[i] = num[min];
            num[min] = x;

        }
    }

    static class card{
        String color;
        int number;
    }
    

}
