import java.util.*;                                                                 
public class Main{                                                               
  static Scanner sc = new Scanner(System.in);                                       
  static int max;                                                                   
  static int [] block;                                                              
  static boolean [] block_visited;                                                  

  public static void main(String [] args){                                          
    while(readLine()){                                                              
      if(solve())System.out.println("OK");                                          
      else System.out.println("NG");                                                
    }                                                                               
  }                                                                                 

  static boolean solve(){                                                           
    int current_block, moved_block;                                                 
    Deque <Integer> stack = new ArrayDeque <Integer>();
    stack.push(0);
    while(!stack.isEmpty()){
      current_block = stack.pop();
      for(int i = 1; i < max; i++){
        moved_block = current_block + i;
        if(moved_block >= block.length) return true;
        else if(moved_block <= 0) moved_block = 0;
        System.out.println(moved_block);
        if(block_visited[moved_block]) continue;
        else{
          block_visited[moved_block] = true;
          if(block[moved_block] == 0 ){
            stack.push(moved_block);
          }else{
            stack.push(moved_block + block[moved_block]);
          }
        }
      }
    }
    return false;
  }
 static boolean readLine(){
    max = sc.nextInt();
    if(max == 0)return false;
    block = new int[sc.nextInt()];
    block_visited = new boolean [block.length];
    Arrays.fill(block_visited, false);
    for(int i = 0; i < block.length; i++){
      block[i]  = sc.nextInt();
    }
    return true;
  }

}