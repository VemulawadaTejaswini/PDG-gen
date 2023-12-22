import java.util.*;


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Charactor> hero = new ArrayList<>();
        for(int i=0;i<n;i++){
            hero.add(new Charactor(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), 1));
        }
        List<Charactor> monster = new ArrayList<>();
        for(int i=0;i<n;i++){
            monster.add(new Charactor(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), 0));
        }

        PartyBattle partyBattle = new PartyBattle(hero, monster);
        Integer turn = partyBattle.battle();
        System.out.println(turn);
        results(partyBattle.heros);
        results(partyBattle.monsters);
    }

    private static void results(List<Charactor> lists) {
        for(Charactor a : lists){
            result(a);
        }
    }

    private static void result(Charactor a) {
        if(a.hp<=0){
            System.out.println(a.name + " is dead.");
        }
        else{
            System.out.println(a.name + " | " + a.hp);
        }
    }
}

class Charactor{
    public String name;
    public int hp;
    public int ap;
    public int dp;
    public int sp;
    public int isHuman; //0: evil, 1: human

    Charactor(String name, int hp, int ap, int dp, int sp, int ishuman) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        this.dp = dp;
        this.sp = sp;
        this.isHuman = ishuman;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        Charactor cha = (Charactor)obj;
        if(
            this.name.equals(cha.name) &&
            this.ap==cha.ap &&
            this.dp==cha.dp &&
            this.sp==cha.sp &&
            this.isHuman==cha.isHuman)
            return true;
        return false;
    }

    public Integer attack(Charactor enemy) {
        return Math.max(this.ap - enemy.dp, 1);
    }

    public void damage(Integer h){
        this.hp -= h;
    }

    public boolean isAlive(){
        return (this.hp > 0);
    }
}

class PartyBattle{
    public List<Charactor> heros;
    public List<Charactor> monsters;
    public List<Integer> attackIdxs;
    public int idxHero;
    public int idxMonster;
    public int turn = 0;

    PartyBattle(List<Charactor> hero, List<Charactor> monster){
        this.heros = hero;
        this.monsters = monster;
        init();
    }

    @Override
    public String toString() {
        String s = "";
        for(Charactor a : this.heros){
            s = s + a.toString() + ", ";
        }
        for(Charactor a : this.monsters){
            s = s + a.toString() + ", ";
        }
        return s.substring(0, s.length()-2);
    }

    private void init() {
        this.idxHero = 0;
        this.idxMonster = 0;
        List<Charactor> attackSort = new ArrayList<>();
        attackSort.addAll(this.heros);
        attackSort.addAll(this.monsters);
        attackSort.sort(new CharactorComparator());
        this.attackIdxs = new ArrayList<>();
        for(int i=0;i<attackSort.size();i++){
            Charactor tmp = attackSort.get(i);
            this.attackIdxs.add(searchCharactor(tmp));
        }
    }

    private Integer searchCharactor(Charactor a) {
        for(int i=0;i<heros.size();i++){
            if(a.equals(heros.get(i))){
                return i;
            }
        }
        for(int i=0;i<monsters.size();i++){
            if(a.equals(monsters.get(i))){
                return heros.size() + i;
            }
        }
        return null;
    }

    public int battle() {
        this.turn = 0;
        while(!isAllDied()){
            battlePerTurn();
            turn++;
        }
        return this.turn;
    }

    private void battlePerTurn() {
        for(Integer p : this.attackIdxs){
            Charactor cha = p<heros.size() ? heros.get(p) : monsters.get(p-heros.size());
            if(!cha.isAlive())continue;
            if(cha.isHuman==1){
                int t = this.idxMonster;
                Charactor mo = monsters.get(t);
                mo.damage(cha.attack(mo));
                monsters.set(t, mo);
                if(!mo.isAlive())this.idxMonster++;
            }
            else{
                int t = this.idxHero;
                Charactor he = heros.get(t);
                he.damage(cha.attack(he));
                heros.set(t, he);
                if(!he.isAlive())this.idxHero++;
            }

            if(isAllDied())break;
        }
    }

    private boolean isAllDied(){
        return this.idxHero==heros.size() || this.idxMonster==monsters.size();
    }
}

class CharactorComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Charactor cha1 = (Charactor)obj1;
        Charactor cha2 = (Charactor)obj2;
        int num1 = cha1.sp;
        int num2 = cha2.sp;
        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}