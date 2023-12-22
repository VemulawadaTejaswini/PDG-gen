import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        if(h == 0 && w == 0){
            break;
        }
        int[][] yard = new int[h][w];
        int max = 0;
        int cap = 0;
        int lakemax = 0;
        int yardmin = 10;
        int flag = 0;
        int cap1 = 0;
        for(int i = 0;i<h;i++){
            for(int j = 0;j<w;j++){
                yard[i][j] = scanner.nextInt();
            }
        }

        for(int i = 3;i <= h;i++){
            for(int j = 3;j<=w;j++){
                for(int h_start = 0;h_start<=h-i;h_start++){
                    for(int w_start = 0;w_start<=w-j;w_start++){
                        for(int h_yardsearch = h_start;h_yardsearch<h_start+i;h_yardsearch++){
                            for(int w_yardsearch = w_start;w_yardsearch<w_start+j;w_yardsearch++){
                                if(h_yardsearch != h_start && h_yardsearch != h_start+i-1){
                                    yardmin = yardmin>yard[h_yardsearch][w_yardsearch]?yard[h_yardsearch][w_yardsearch]:yardmin;
                                    yardmin = yardmin>yard[h_yardsearch][w_yardsearch+j-1]?yard[h_yardsearch][w_yardsearch+j-1]:yardmin;
                                    break;
                                }
                                yardmin = yardmin>yard[h_yardsearch][w_yardsearch]?yard[h_yardsearch][w_yardsearch]:yardmin;
                                
                            }
                        }
                        for(int h_lakesearch = h_start+1;h_lakesearch<h_start+i-1;h_lakesearch++){
                            for(int w_lakesearch = w_start+1;w_lakesearch<w_start+j-1;w_lakesearch++){
                                cap1 = yardmin-yard[h_lakesearch][w_lakesearch];
                                if(cap1<=0){
                                    flag = 1;
                                    break;
                                }else{
                                    cap += cap1;
                                }
                            }
                            if(flag == 1){
                                break;
                            }
                        }
                        if(flag ==1){
                        }else{
                            max = max<cap?cap:max;
                        }
                        cap = 0;
                        flag = 0;
                        yardmin = 10;
                    }
                }
            }
        }

        System.out.println(max);
    }
    }
}
