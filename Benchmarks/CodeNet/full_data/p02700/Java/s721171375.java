import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Monster[] m = new Monster[]{
      new Monster(sc.nextInt(), sc.nextInt()),
      new Monster(sc.nextInt(), sc.nextInt())
    };
    int turn = 0;
    while (!m[turn++%2].isDead()) {
      m[turn%2].beAttacked(m[(turn-1)%2]);
    }
    
    System.out.println(turn%2 == 0 ? "Yes" : "No");
  }
  
  static class Monster {
    int hp;
    int attack;
    
    Monster(int hp, int attack) {
      this.hp = hp;
      this.attack = attack;
    }
    
    void beAttacked(Monster enemy) {
      this.hp -= enemy.attack;
    }
   
    boolean isDead() {
      return this.hp <= 0;
    }
  }
}
