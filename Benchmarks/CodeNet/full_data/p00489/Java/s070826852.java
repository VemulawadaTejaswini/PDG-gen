import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] team = new int[n];
            for(int i = 0;i < n*(n-1)/2;i++){
            	int a = scan.nextInt() - 1;
            	int b = scan.nextInt() - 1;
            	int c = scan.nextInt();
            	int d = scan.nextInt();
            	if(c == d){
            		team[a]++;
            		team[b]++;
            	}else if(c > d){
            		team[a]+=3;
            	}else{
            		team[b]+=3;
            	}
            }
            int[] sort = new int[team.length];
            for(int i = 0;i < sort.length;i++){
            	sort[i] = team[i];
            }
            Arrays.sort(sort);
            for(int i = 0;i < team.length/2;i++){
            	int t = sort[i];
            	sort[i] = sort[team.length - 1 - i];
            	sort[team.length - 1 - i] = t;
            }
            for(int i = 0;i < team.length;i++){
            	for(int j = 0;j < sort.length;j++){
            		if(team[i] == sort[j]){
            			team[i] = j+1;
            			break;
            		}
            	}
            }
            for(int i = 0;i < team.length;i++){
            	System.out.println(team[i]);
            }
        }
    }
}