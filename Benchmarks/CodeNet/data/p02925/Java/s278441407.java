import java.util.*;

class Main {
  
  static class Player {
    int number;
    int[] matches;
    int matchedCount;
    
    public Player(int number, int count) {
      this.number = number;
      this.matches = new int[count];
      this.matchedCount = 0;
    }
  }
  
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = -1;
    
    Player[] players = new Player[n];
    for (int i = 0; i < n; i++) {
      Player player = new Player(i+1, n-1);
      
      for (int j = 0; j < n-1; j++) {
        player.matches[j] = sc.nextInt();
      }
      
      players[i] = player;
    }
    
    int day = 0;
    while(true) {
      int todayMatchCount = 0;
      for (int i = 0; i < n; i++) {
        Player player = players[i];
        if (player.matchedCount > day || player.matchedCount == n-2) {
          continue;
        }
        int x = player.matches[player.matchedCount];
        if (players[x].matchedCount > day || players[x].matchedCount == n-2) {
          continue;
        }
        int y = players[x].matches[players[x].matchedCount];
        
        if (x == y) {
          player.matchedCount++;
          players[x].matchedCount++;
          todayMatchCount++;
        }
      }
      
      if (todayMatchCount == 0) break;
      day++;
    }
    
    if (day < n-1) day = -1;
    System.out.println(day);
	}
}
