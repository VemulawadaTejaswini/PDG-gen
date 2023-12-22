import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int h = in.nextInt(), w = in.nextInt();
			if(w==0 && h==0) return ;
			String board[] =  new String[h];
			for(int i=0; i<h; i++){
				board[i] = in.next();
			}
			int cx = 0, cy = 0;
			boolean isLoop = false;
			HashSet<Integer> s = new HashSet<Integer>();
			while(board[cy].charAt(cx) != '.'){
				char c = board[cy].charAt(cx);
				cx += (c == '>')?1:(c == '<')?-1:0;
				cy += (c == '^')?-1:(c == 'v')?1:0;
				if(s.contains(new Integer(cx*10000+cy))){
					isLoop = true;
					break;
				}
				else{
					s.add(new Integer(cx*10000+cy));
				}
			}
			if(isLoop){
				System.out.println("LOOP");
			}
			else{
				System.out.println(cx + " " + cy);
			}
		}
	}
	
}