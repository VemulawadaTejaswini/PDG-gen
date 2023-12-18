import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        char[][] field = new char[h][w];
        
        for(int i = 0; i < h; i++){
            String s = sc.next();
            for(int j = 0; j < w; j++){
                field[i][j] = s.charAt(j);
            }
        }
        
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(field[i][j] == '#'){
                    try{ if(field[i+1][j] == '#') continue; }catch(Exception e){}
                    try{ if(field[i-1][j] == '#') continue; } catch(Exception e){}
                    try{ if(field[i][j+1] == '#') continue;} catch(Exception e){}
                    try{ if(field[i][j-1] == '#') continue;} catch(Exception e){}
                    
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
    }
}
