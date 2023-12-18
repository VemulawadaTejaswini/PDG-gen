import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	long numMonster = s.nextLong();
      	long numSpMoves = s.nextLong();
      	if(numSpMoves>numMonster){
      	    System.out.println("0");
      	    return;
      	}
      	List<Integer> monsterList = new ArrayList<Integer>((int)numMonster);
      	for(int i=0;i<(int)numMonster;i++){
        	monsterList.add(s.nextInt());
        }
      	Collections.sort(monsterList);
      	Collections.reverse(monsterList);
      	for (int i=0;i<(int)numSpMoves ;i++ ){
      	    monsterList.remove(i);
      	} 
      	long numAttack = 0;
      	for(int i=0;i<monsterList.size();i++){
      	    numAttack+=monsterList.get(i);
      	}
      	System.out.println(numAttack);
    }
}