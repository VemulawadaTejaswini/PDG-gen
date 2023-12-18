import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int H = sc.nextInt();
      	int W = sc.nextInt();
      	int total = H * W;
      	List<Integer> mapList = new ArrayList<>();
      	List<Integer> bombList = new ArrayList<>();
      	for(int i = 0; i < H; i++){
        	String[] strs = sc.next().split("");
          	for(int j = 0; j < strs.length; j++){
              	if(strs[j].equals("#")){
                  	mapList.add(-1);
                	bombList.add(i * W + j);
                }else{
                	mapList.add(0);
                }
            }
        }
      
      	for(Integer i : bombList){
        	int x1 = i - W - 1;
          	int x2 = i - W;
          	int x3 = i - W + 1;
          	int x4 = i - 1;
          	int x5 = i + 1;
          	int x6 = i + W - 1;
          	int x7 = i + W;
          	int x8 = i + W + 1;
          	if(x1 >= 0 && i % W != 0) mapList.set(x1, mapList.get(x1) != -1 ? mapList.get(x1) + 1 : -1);
          	if(x2 >= 0) mapList.set(x2, mapList.get(x2) != -1 ? mapList.get(x2) + 1 : -1);
          	if(x3 >= 0 && (i + 1) % W != 0) mapList.set(x3, mapList.get(x3) != -1 ? mapList.get(x3) + 1 : -1);
          	if(x4 >= 0 && i % W != 0) mapList.set(x4, mapList.get(x4) != -1 ? mapList.get(x4) + 1 : -1);
          
          	if(x5 < total && (i + 1) % W != 0) mapList.set(x5, mapList.get(x5) != -1 ? mapList.get(x5) + 1 : -1);
          	if(x6 < total && i % W != 0) mapList.set(x6, mapList.get(x6) != -1 ? mapList.get(x6) + 1 : -1);
          	if(x7 < total) mapList.set(x7, mapList.get(x7) != -1 ? mapList.get(x7) + 1 : -1);
          	if(x8 < total && (i + 1) % W != 0) mapList.set(x8, mapList.get(x8) != -1 ? mapList.get(x8) + 1 : -1);
        }

      	for(int i = 0; i < H; i++){
          	StringBuilder sb = new StringBuilder();
            for(int j = 0; j < W; j++){
                int mapItem = mapList.get(i * W + j);
				if(mapItem == -1){
                	sb.append("#");
                }else{
                  	sb.append(mapItem);
                }
            }
          	System.out.println(sb.toString());
        }
    }
}