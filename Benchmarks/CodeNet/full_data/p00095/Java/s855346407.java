import java.util.Scanner;
class Main {
	Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		Main app = new Main();
		while(app.scan.hasNext()){
			int n = Integer.parseInt(app.scan.nextLine());
			int[][] entrant = new int[n][2];
			app.input(n, entrant);
			int index = app.max(n,entrant);
			System.out.println(entrant[index][0]+" "+entrant[index][1]);
		}
	}
	
	public void input(int n,int[][] e){
		String[] splitLine;
		for(int i=0;i<n;i++){
			splitLine = scan.nextLine().split(" ");
			e[i][0] = Integer.parseInt(splitLine[0]);
			e[i][1] = Integer.parseInt(splitLine[1]);
		}
	}
	
	public int max(int n,int[][] e){
		int max=0;
		int index = 0;
		
		for(int i=0;i<n;i++){
			if(e[i][1] > max){
				max = e[i][1];
				index = i;
			}
		}
		
		for(int i=0;i<n;i++){
			if(e[i][1] == max){
				if(e[i][0] < e[index][0]){
					index = i;
				}
			}
		}
		
		return index;
	}
}