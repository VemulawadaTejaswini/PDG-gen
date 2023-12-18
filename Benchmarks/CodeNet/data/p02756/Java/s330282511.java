import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
StringBuilder sbA = new StringBuilder();
StringBuilder sbB = new StringBuilder();
	int Q = sc.nextInt();
	int[][] query = new int[Q][2]; //各命令の１、２つめを格納
	char[] queryChar = new char[Q]; //各命令のcharを格納
	//List<Character> listA = new ArrayList<>();
    //List<Character> listB = new ArrayList<>();
	int revCount =0;
	//２つのリストを作る
	for(int i=0; i<Q; i++) {
		query[i][0] = sc.nextInt();
		if ( query[i][0] == 2) {
			query[i][1] = sc.nextInt();
			queryChar[i] = sc.next().charAt(0);
		}
	}
	
	//命令実行部
	for(int i=0; i<Q; i++) {
		//反転
		if( query[i][0] == 1){
			revCount++;
			//反転していない状態
	} else if( revCount % 2 == 0) {
		    //先頭に追加
			if ( query[i][1] == 1) {
				//listA.add(0,queryChar[i]);
				sbA.insert(0,queryChar[i]);	
				//末尾に追加
			} else if  (query[i][1] == 2){
				//listA.add(queryChar[i]);
				sbB.append(queryChar[i]);
			}
			//反転してる状態
		} else {
			if ( query[i][1] == 1) {
				//listA.add(queryChar[i]);
				sbB.append(queryChar[i]);
			} else if  (query[i][1] == 2){
				//listA.add(0,queryChar[i]);
				sbA.insert(0,queryChar[i]);	
			}			
		}		
	}
	
		if ( revCount %2 == 0)
		//for(int i=0; i< listA.size(); i++)System.out.print(listA.get(i));
			System.out.print(sbA + S + sbB);
		else {
			char[] C = S.toCharArray();
			StringBuilder sbC = new StringBuilder();
			for(int i=0; i<C.length; i++) {
				sbC.append(C[C.length - i - 1]);
			}
			System.out.print(sbA);
			System.out.print(sbC);			System.out.print(sbB);				
		}
			
		//for(int i=0; i<listA.size(); i++) 
			//System.out.print(listA.get(listA.size() - 1 - i));
			
  }
}