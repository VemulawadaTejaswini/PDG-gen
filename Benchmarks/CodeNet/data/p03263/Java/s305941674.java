import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H][W];
        int count = 0;
        int startx = 0;
        int starty = 0;
        int lastx = 0;
        int lasty = 0;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j]%2 == 1){
                    count++;
                    if(count == 1){
                        startx = i;
                        starty = j;
                    }
                }
            }
        }
        sc.close();

        if(count == 0){
            System.out.println(0);
        } else {
            int i = startx;
            int j = starty;
            int N = 0;
            int cnt = 1;
            ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> l = new ArrayList<>();
            l.add(startx);
            l.add(starty);
            list.add(l);
            while(cnt != count){
                if(cnt%2 == 1)
                    N++;
                //System.out.print(i+1 + " " + j+1 + " ");
                if((i-startx)%2 == 0){
                    if(j!= W-1){
                        //System.out.println(i+1 + " " + j+2);
                        j++;
                    } else {
                        //System.out.println(i+2 + " " + j+1);
                        i++;
                    }
                } else {
                    if(j!= 0){
                        //System.out.println(i+1 + " " + j);
                        j--;
                    } else {
                        //System.out.println(i+2 + " " + j+1);
                        i++;
                    }
                }
                if(a[i][j]%2 == 1){
                    cnt++;
                    lastx = i;
                    lasty = j;
                    ArrayList<Integer> list1 = new ArrayList<>();
                    list1.add(i);
                    list1.add(j);
                    list.add(list1);
                }
            }
            
            i = startx;
            j = starty;
            System.out.println(N);
            while(list.size() > 1){
                i = list.get(0).get(0);
                j = list.get(0).get(1);
                while(i != list.get(1).get(0)|| j !=list.get(1).get(1)){
                    System.out.print((i+1) + " " + (j+1) + " ");
                    if((i-startx)%2 == 0){
                        if(j!= W-1){
                            System.out.println((i+1) + " " + (j+2));
                            j++;
                        } else {
                            System.out.println((i+2) + " " + (j+1));
                            i++;
                        }
                    } else {
                        if(j!= 0){
                            System.out.println((i+1) + " " + j);
                            j--;
                        } else {
                            System.out.println((i+2) + " " + (j+1));
                            i++;
                        }
                    }
                }
                list.remove(0);
                list.remove(0);
            }
        }
    }
}