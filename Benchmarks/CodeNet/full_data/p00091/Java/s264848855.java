import java.util.*;

public class Main {
	int n;
	int[][] inputmap = new int[10][10];
	int[][] map = new int[10][10];
	int[] a = new int[]{0,1,-1,0,0,1,1,-1,-1,2,-2,0,0};
	int[] b = new int[]{0,0,0,1,-1,1,-1,1,-1,0,0,2,-2};
	int[] c = new int[]{0,5,9,13};
	LinkedList<Integer> y = new LinkedList<Integer>();
	LinkedList<Integer> x = new LinkedList<Integer>();
	LinkedList<Integer> p = new LinkedList<Integer>();
	
	boolean match(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(inputmap[i][j]!=map[i][j]) return false;
			}
		}
		return true;
	}
	
	void loop(){
		if(x.size()==n){
			if(match()){
				for(int i=0;i<n;i++) System.out.println(x.get(i) + " " + y.get(i) + " " + p.get(i));
				System.exit(0);
			}else{
				return;
			}
		}
		for(int i=1;i<9;i++){
			for(int j=1;j<9;j++){
				for(int k=1;k<=3;k++){ 
					if(k==3 && (i==1 || j==1 || i==8 || j==8)) continue;
					boolean flag = true;
					for(int s=0;s<c[k];s++){
						map[i+a[s]][j+b[s]]++;
						if(inputmap[i+a[s]][j+b[s]]<map[i+a[s]][j+b[s]]) flag = false;
					}
					if(flag==true){
						y.push(i);
						x.push(j);
						p.push(k);
						loop();
						y.pop();
						x.pop();
						p.pop();
					}
					for(int s=0;s<c[k];s++) map[i+a[s]][j+b[s]]--;
				}
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				inputmap[i][j] = sc.nextInt();
			}
		}
		loop();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}