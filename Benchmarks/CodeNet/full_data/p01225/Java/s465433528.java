import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        int flag = 0;
        for(int k=0;k<n;k++){
            int[] x = new int[9];
            //int[] c = new int[9];
            int[] red = new int[9];
            int[] green = new int[9];
            int[] blue = new int[9];
            //List<Integer> red = new ArrayList<>();
            //List<Integer> blue = new ArrayList<>();
            //List<Integer> green = new ArrayList<>();
            flag=0;
            for(int i=0; i<9;i++){
                x[i] = sc.nextInt();           
            }
            for(int i=0; i<9;i++){
                s = sc.next();
                if(s.equals("R")){
                    red[x[i]-1]++;
                }
                else if(s.equals("G")){
                    green[x[i]-1]++;
                }    
                else {
                    blue[x[i]-1]++;
                }         
            }
            for(int i=0; i<7;i++){
                if((red[i]%3)==1||red[i]%3==2){
                    red[i+1]-=red[i]%3;
                    red[i+2]-=red[i]%3;
                    red[i]-=red[i]%3;
                }
            }
            for(int i=0; i<9;i++){
                if(red[i]%3==0){
                    red[i]-=(red[i]/3)*3;
                }
            }
            for(int i=0; i<7;i++){
                if((green[i]%3)==1||green[i]%3==2){
                    green[i+1]-=green[i]%3;
                    green[i+2]-=green[i]%3;
                    green[i]-=green[i]%3;
                }
            }
            for(int i=0; i<9;i++){
                if(green[i]%3==0){
                    green[i]-=(green[i]/3)*3;
                }
            }
            for(int i=0; i<7;i++){
                if((blue[i]%3)==1||blue[i]%3==2){
                    blue[i+1]-=blue[i]%3;
                    blue[i+2]-=blue[i]%3;
                    blue[i]-=blue[i]%3;
                }
            }
            for(int i=0; i<9;i++){
                if(blue[i]%3==0){
                    blue[i]-=(blue[i]/3)*3;
                }
            }
            for(int i=0; i<9;i++) {
                if(red[i]!=0||blue[i]!=0||green[i]!=0){
                    flag++;
                    //System.out.println(red[i]+":"+green[i]+":"+blue[i]);
                }
                red[i]=0;blue[i]=0;green[i]=0;
            }
            if(flag==0){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
            //Collections.sort(red);
            //Collections.sort(green);
            //Collections.sort(blue);
            
        }
        
        sc.close();
    }
}

