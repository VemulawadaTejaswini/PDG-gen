import java.util.*;


public class Main{
    private static int height, width;
    private static int[][] map;

    private static boolean isExistOrRoad(int h, int w){
        if(h < 0 || w < 0) return false;
        if(height <= h || width <= w) return false;
        if(map[h][w] == -1) return false;
        return true;
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
        width  = sc.nextInt();
        int c_h = sc.nextInt() - 1;
        int c_w = sc.nextInt() - 1;
        int d_h = sc.nextInt() - 1;
        int d_w = sc.nextInt() - 1;

        map = new int[height][width];

        for(int h=0; h<height; h++){
            String line = sc.next();
            for(int w=0; w<width; w++){
                map[h][w] = (line.charAt(w) == '#') ? -1 : Integer.MAX_VALUE;
            }
        }

        map[c_h][c_w] = 0; //startpoint

        boolean is_update = true;
        while(is_update){
            is_update = false;
            for(int h=0; h<height; h++){
                for(int w=0; w<width; w++){
                    //ignore wall
                    if(map[h][w] == -1){
                        continue;
                    }
                    int past_val = map[h][w];

                    // walk up
                    if(isExistOrRoad(h-1, w)) map[h][w] = Math.min(map[h][w], map[h-1][w]);
                    // walk down
                    if(isExistOrRoad(h+1, w)) map[h][w] = Math.min(map[h][w], map[h+1][w]);
                    // walk left
                    if(isExistOrRoad(h, w-1)) map[h][w] = Math.min(map[h][w], map[h][w-1]);
                    // walk right
                    if(isExistOrRoad(h, w+1)) map[h][w] = Math.min(map[h][w], map[h][w+1]);

                    // warp 
                    // [h+2,w-2],[h+2,w-1],[h+2,w],[h+2,w+1],[h+2,w+2],
                    // [h+1,w-2],[h+1,w-1],       ,[h+1,w+1],[h+1,w+2],
                    // [h  ,w-2],                            [h  ,w+2],
                    // [h-1,w-2],[h-1,w-1],       ,[h-1,w+1],[h-1,w+2],
                    // [h-2,w-2],[h-2,w-1],[h-2,w],[h-2,w+1],[h-2,w+2],
                    for(int h_warp=h-2; h_warp < h+2; h_warp++){
                        for(int w_warp=w-2; w_warp < w+2; w_warp++){
                            if(!isExistOrRoad(h_warp, w_warp)){
                                continue;
                            }
                            if(map[h][w] > map[h_warp][w_warp]){
                                map[h][w] = map[h_warp][w_warp] + 1;
                            }
                        }
                    }

                    if(map[h][w] != past_val)
                        is_update = true;
                }
            }
        }

        /*
        for(int h=0; h<height; h++){
            for(int w=0; w<width; w++){
                if(map[h][w] == Integer.MAX_VALUE)
                    System.out.print('M');
                else if(map[h][w] == -1)
                    System.out.print('#');
                else
                    System.out.print(map[h][w]);
            }
            System.out.println();
        }
        */
          

        if(map[d_h][d_w] == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(map[d_h][d_w]);
        }

		sc.close();
	}
}