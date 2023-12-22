import java.io.*;
public class Main{
    public static void main(String args[]){
		Main a = new Main();
    }
    
    public Main(){
        run();
        //showMap();
    }

    String[][] map;
    
    private void showMap(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    private void run(){
        try{
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            int H = -1;            
            int W = -1;
            int expected = 0;
            
            String line = "";
            int tempH = 0;
            while((line = stdReader.readLine())!=null) {
                if(W==-1){
                    H = Integer.valueOf(line.split(" ")[0]);
                    W = Integer.valueOf(line.split(" ")[1]);
                    map = new String[H][W];
                }else if(!line.equals("0 0")){
                    setLine(tempH, line);
                    tempH += 1;
                }else if(line.equals("0 0")){
					solve();
					W = -1;
					H = -1;
					tempH = 0;
				}
            }
            stdReader.close();
        }catch(Exception e){
			e.getStackTrace();
        }
    }
    private void solve(){
        int person = 0;
        int[] point;
        while((point = getPointOfNotSearcherArea()) != null){
            search(point);
            person++;
        }
        System.out.println(person);
    }
    
    private void search(int[] point){
        int x = point[0];
        int y = point[1];
        String temp = map[x][y];
        map[x][y] = "_";
        for(int diff = -1;  diff<=1; diff++){
            if(x+diff>=0 && x+diff<map.length){
                if(map[x+diff][y].equals(temp)&&!map[x+diff][y].equals("_")){
                    int[] neoPoint = {x+diff, y};
                    search(neoPoint);
                }
            }
            if(y+diff>=0 && y+diff<map.length){
                if(map[x][y+diff].equals(temp)&&!map[x][y+diff].equals("_")){
                    int[] neoPoint = {x, y+diff};
                    search(neoPoint);
                }
            }
        }
        //showMap();
        //System.out.println("");
    }

    private int[] getPointOfNotSearcherArea(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(!map[i][j].equals("_")){
                    int point[] = {i,j};
                    return point;
                }
            }
        }
        return null;
    }
        
    private void setLine(int tempH, String input){
        for(int i = 0; i < map[tempH].length; i++){
            String entity = input.substring(i,i+1);
            map[tempH][i] = entity;
        }
    }
}

    