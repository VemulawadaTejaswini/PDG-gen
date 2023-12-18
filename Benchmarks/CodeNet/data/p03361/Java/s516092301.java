import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int w = sc.nextInt();
            String line[] = new String[h];
            for(int i=0;i<h;i++){
              line[i] = sc.next();
            }

            int x[] = {0,0,1,-1};
            int y[] = {1,-1,0,0};

            boolean check = true;
            
            for(int i=0;i<h;i++){
              for(int j=0;j<w;j++){
                if(line[i].charAt(j)!='#')break;
                check = false;
                for(int k=0;k<4;k++){
                   int dx = i+x[k];
                   int dy = j+y[k];
                   if(dx<0||dx>=h||dy<0||dy>=w) continue;
                   if(line[dx].charAt(dy)=='#'){
                     check = true;
                     continue;
                   }
                }
                if(!check)break;
              }
              if(!check)break
            }

          String ans = check?"Yes":"No";
          System.out.println(ans);
          }
        }