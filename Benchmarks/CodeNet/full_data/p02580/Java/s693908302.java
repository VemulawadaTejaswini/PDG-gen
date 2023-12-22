import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int h= sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[][] bom = new int[h][w];
        
        for(int i = 0; i < m; i++){
          int tmph = sc.nextInt();
          int tmpw = sc.nextInt();
          bom[tmph-1][tmpw-1] = 8;
        }
      
      /*for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
          System.out.print(bom[i][j]);
        }
        System.out.println();
      }*/
      
      int countHH = 0;
      ArrayList<Integer> hh = new ArrayList<>();
      for(int i = 0; i < h; i++){
        int countH = 0;
        for(int j = 0; j < w; j++){
            if(bom[i][j] == 8){
              countH++;
            }
        }
        
        if(countHH < countH){
          countHH = countH;
        }
      }
      
      for(int i = 0; i < h; i++){
        int counth = 0;
        for(int j = 0; j < w; j++){
            if(bom[i][j] == 8){
              counth++;
            }
        }
        
        if(counth == countHH){
          hh.add(i);
        }
      }
      
      int countWW = 0;
      ArrayList<Integer> ww = new ArrayList<>();
      for(int i = 0; i < w; i++){
        int countW = 0;
        for(int j = 0; j < h; j++){
            if(bom[j][i] == 8){
              countW++;
            }
        }
        
        if(countWW < countW){
          countWW = countW;
        }
      }
      
      for(int i = 0; i < w; i++){
        int countw = 0;
        for(int j = 0; j < h; j++){
            if(bom[j][i] == 8){
              countw++;
            }
        }
        
        if(countw == countWW){
          ww.add(i);
        }
      }
     
      int countd = 0;
      for(int i = 0; i < hh.size(); i++){
        int hf = hh.get(i);
        for(int j = 0; j < ww.size(); j++){
          int wf = ww.get(j);
          if(bom[hf][wf] == 8){
            countd++;
          }
        }
      }
      
      if(hh.size() == h){
        countd = 0;
      }
      if(ww.size() == w){
        countd = 0;
      }
      int ans = countWW + countHH;
      if(countd > 1){
        System.out.println(ans-countd+1);
      }else{
        System.out.println(ans);
      }
	}
}