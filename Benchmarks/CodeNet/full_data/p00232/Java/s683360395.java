import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	class Board{
		private int type,effect;
		public int getType(){return type;}
		public int getEffect(){return effect;}
		Board(){this.type=0;this.effect=0;}
		Board(int type,int effect){this.type=type;this.effect=effect;}
	}
	
	class Data{
		private int position,money,depth;
		public int getPosition(){return position;}
		public int getMoney(){return money;}
		public int getDepth(){return depth;}
		Data(int position,int money,int depth){this.position=position;this.money=money;this.depth=depth;}
	}
	
	int solve(int[] roulette,Board[] board){
		Stack<Data> stk=new Stack<Data>();
		Map<Integer,Double> table=new HashMap<Integer,Double>();
		stk.add(new Data(0,0,0));
		
		while(!stk.isEmpty()){
			int pos=stk.peek().getPosition();
			int money=stk.peek().getMoney();
			int depth=stk.peek().getDepth();
			stk.pop();
			if(pos>=board.length-1){
				Double probability=table.get(money);
				table.put(money,probability==null?Math.pow(roulette.length,-depth):probability+Math.pow(roulette.length,-depth));
				continue;
			}
			switch(board[pos].type){
			case 1:
				pos+=board[pos].getEffect();
				break;
			case 2:
				money+=board[pos].getEffect();
				break;
			case 3:
				money-=board[pos].getEffect();
				money=money<0?0:money;
				break;
			}
			for(int value:roulette){
				stk.push(new Data(pos+value,money,depth+1));
			}
		}
		double expect=0;
		for(Map.Entry<Integer,Double> e:table.entrySet()){
			expect=e.getKey()*e.getValue();
		}
		return (int)expect;
	}
	
	void io(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
			if(x==0&&y==0&&z==0)break;
			int[] roulette=new int[x];
			Board[] board=new Board[y+1];
			for(int i=0;i<=y;++i){board[i]=new Board();}
			for(int i=0;i<x;++i){
				roulette[i]=sc.nextInt();
			}
			for(int i=0;i<z;++i){
				int n=sc.nextInt(),e=sc.nextInt(),a=sc.nextInt();
				board[n]=new Board(e,a);
			}
			System.out.println(solve(roulette,board));
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		new Main().io();
	}

}