public class Main {
    public static void main(String[] args) {
        String seedStr= args[0];
        Integer seed = Integer.valueOf(seedStr);
        Integer cubicSeed = seed * seed * seed; 
        System.out.println(cubicSeed);
    }
}