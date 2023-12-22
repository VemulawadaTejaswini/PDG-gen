import java.io.*;
import java.util.*;
import java.awt.Point;
public class Main{
	public static void main(String[] args) throws IOException, StackOverflowError{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> Ansers = new ArrayList<Integer>();
        String line;

        while((line = in.readLine()) != null){
        	//first line
            String[] areaInformation = line.split(" ");
            int height = Integer.parseInt(areaInformation[0]);
            int width  = Integer.parseInt(areaInformation[1]);
            //separater
            if(height == 0 && width == 0){
                break;
            }

            //after second line
            byte[][] areaName       = new byte[height+1][width+1];
            boolean[][] someoneOwns = new boolean[height+1][width+1];
            //for each line i.e. current row
            for(int currentHeight = 0; currentHeight < height; ++currentHeight){
            	//get row data
                line = in.readLine();
                //outer zone
                areaName[currentHeight][width+1] = 0;
                someoneOwns[currentHeight][width+1] = true;
                for(int currentWidth = 0; currentWidth < width; ++currentWidth){
                	//get column data
                    String c = line.substring(currentWidth, currentWidth+1);
                    //outer zone
	                areaName[height+1][currentWidth] = 0;
    	            someoneOwns[height+1][currentWidth] = true;
	                //main area
                    if(c.equals("@")){
                        areaName[currentHeight][currentWidth] = 1;
                    }
                    else if(c.equals("#")){
                        areaName[currentHeight][currentWidth] = 2;
                    }
                    else if(c.equals("*")){
                        areaName[currentHeight][currentWidth] = 3;
                    }
                    someoneOwns[currentHeight][currentWidth] = false;
                }
            }

            int count = 0;
            for(int currentHeight = 0; currentHeight < height; ++currentHeight){
                for(int currentWidth = 0; currentWidth < width; ++currentWidth){
                    if(!someoneOwns[currentHeight][currentWidth]){
                        count++;
                        createOwnersArea(areaName, someoneOwns, currentHeight, currentWidth);
                    }
                }
            }

            Ansers.add(count);
        }

        for(Integer anser : Ansers){
            System.out.println(anser);
        }
    }
    public static void createOwnersArea(byte[][] areaName, boolean[][] someoneOwns, int currentHeight, int currentWidth){
    	Stack<Point> dfsArea = new Stack<Point>();
    	dfsArea.push(new Point(currentHeight, currentWidth));
    	someoneOwns[currentHeight][currentWidth] = true;
    	while(!dfsArea.empty()){
    		Point currentPosition = dfsArea.peek();
    		//check down
    		if(!someoneOwns[currentPosition.x+1][currentPosition.y]
    			&& areaName[currentPosition.x][currentPosition.y] == areaName[currentPosition.x+1][currentPosition.y]){
    			someoneOwns[currentPosition.x+1][currentPosition.y] = true;
    			dfsArea.push(new Point(currentPosition.x+1, currentPosition.y));
    			continue;
    		}
    		//check right
    		if(!someoneOwns[currentPosition.x][currentPosition.y+1]
    			&& areaName[currentPosition.x][currentPosition.y] == areaName[currentPosition.x][currentPosition.y+1]){
    			someoneOwns[currentPosition.x][currentPosition.y+1] = true;
    			dfsArea.push(new Point(currentPosition.x, currentPosition.y+1));
    			continue;
    		}
    		dfsArea.pop();
    	}
    }
}