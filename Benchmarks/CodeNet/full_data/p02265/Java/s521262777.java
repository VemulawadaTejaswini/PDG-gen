import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int[][] list = new int[2000000][3];
    	int start = -1;
    	int end = 0;
    	int now = 0;
    	for(int i = 0; i < n; i++){
    		String line = scan.next();
    		switch(line){
    			case "insert":
    				list[now][0] = -1;
    				list[now][1] = scan.nextInt();
    				list[now][2] = start;
    				if(start != -1){
    					list[start][0] = now;
    				}
    				start = now;
    				now++;
    				break;
    			case "delete":
    				int num = scan.nextInt();
    				int j = start;
	    			while(j != -1){
	    				if(list[j][1] == num){
	    					if(j == start){
	    						list[list[start][2]][0] = -1;
    							start = list[start][2];
	    					}else if(j == end){
	    						list[list[end][0]][2] = -1;
    							end = list[end][0];
	    					}else{
	    						list[list[j][0]][2] = list[j][2];
	    						list[list[j][2]][0] = list[j][0];
	    					}
	    					break;
	    				}
	    				j = list[j][2];
	    			}
    				break;
    			case "deleteFirst":
    				list[list[start][2]][0] = -1;
    				start = list[start][2];
    				break;
    			case "deleteLast":
    				list[list[end][0]][2] = -1;
    				end = list[end][0];
	    			break;
    		}
    	}
    	int i = start;
    	while(i != end){
    		System.out.print(list[i][1]+" ");
    		i = list[i][2];
    	}
    	System.out.println(list[i][1]);
    }
}
