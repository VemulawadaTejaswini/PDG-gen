import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int h = scanner.nextInt();
        final int w = scanner.nextInt();
        scanner.nextLine();

        final Box[][] boxes = new Box[h][w];
        for (int i = 0; i < h; i++) {
            final String s = scanner.nextLine();
            boxes[i] = new Box[w];
            for (int j = 0; j < w; j++) {
                boxes[i][j] = new Box(j, i, Color.byMark(s.substring(j, j + 1)));
            }
        }

        final Set<Set<Box>> connectedComponents = Arrays.stream(boxes)
                .flatMap(Arrays::stream)
                .map(Collections::singleton)
                .collect(Collectors.toSet());
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                final Box baseBox = boxes[i][j];
                final Set<Set<Box>> componentsToRemove = new HashSet<>();
                componentsToRemove.add(connectedComponents.stream()
                        .filter(component -> component.contains(baseBox))
                        .findFirst()
                        .orElseThrow(InternalError::new));
                final Set<Box> newConnectedComponents = new HashSet<>();
                newConnectedComponents.add(baseBox);
                if (baseBox.getY() > 0) {
                    final Box up =  boxes[baseBox.getY() - 1][baseBox.getX()];
                    if (baseBox.getColor() != up.getColor()) {
                        final Set<Box> componentToRemove = connectedComponents.stream()
                                .filter(component -> component.contains(up))
                                .findFirst()
                                .orElseThrow(InternalError::new);
                        componentsToRemove.add(componentToRemove);
                        newConnectedComponents.addAll(componentToRemove);
                    }
                }
                if (baseBox.getY() < h - 1) {
                    final Box down =  boxes[baseBox.getY() + 1][baseBox.getX()];
                    if (baseBox.getColor() != down.getColor()) {
                        final Set<Box> componentToRemove = connectedComponents.stream()
                                .filter(component -> component.contains(down))
                                .findFirst()
                                .orElseThrow(InternalError::new);
                        componentsToRemove.add(componentToRemove);
                        newConnectedComponents.addAll(componentToRemove);
                    }
                }
                if (baseBox.getX() > 0) {
                    final Box left =  boxes[baseBox.getY()][baseBox.getX() - 1];
                    if (baseBox.getColor() != left.getColor()) {
                        final Set<Box> componentToRemove = connectedComponents.stream()
                                .filter(component -> component.contains(left))
                                .findFirst()
                                .orElseThrow(InternalError::new);
                        componentsToRemove.add(componentToRemove);
                        newConnectedComponents.addAll(componentToRemove);
                    }
                }
                if (baseBox.getX() < w - 1) {
                    final Box right = boxes[baseBox.getY()][baseBox.getX() + 1];
                    if (baseBox.getColor() != right.getColor()) {
                        final Set<Box> componentToRemove = connectedComponents.stream()
                                .filter(component -> component.contains(right))
                                .findFirst()
                                .orElseThrow(InternalError::new);
                        componentsToRemove.add(componentToRemove);
                        newConnectedComponents.addAll(componentToRemove);
                    }
                }
                connectedComponents.removeAll(componentsToRemove);
                connectedComponents.add(Collections.unmodifiableSet(newConnectedComponents));
            }
        }

        final int pairs = connectedComponents.stream()
                .filter(component -> component.size() > 1)
                .mapToInt(component -> {
                    final int blackBoxCount = (int) component.stream()
                            .filter(box -> box.getColor() == Color.B)
                            .count();
                    return blackBoxCount * (component.size() - blackBoxCount); // contains doubles
                })
                .sum();
        System.out.println(pairs);

    }

    public static class Box {
        private final int x;
        private final int y;
        private final Color color;
        public Box(final int x, final int y, final Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
        public int getX() {
            return this.x;
        }
        public int getY() {
            return this.y;
        }
        public Color getColor() {
            return this.color;
        }
        @Override
        public int hashCode() {
            return Objects.hash(this.x, this.y, this.color);
        }
        @Override
        public boolean equals(final Object object) {
            if (object == null) {
                return false;
            }
            if (object == this) {
                return true;
            }
            if (!(object instanceof Box)) {
                return false;
            }
            final Box other = (Box) object;
            return this.x == other.x && this.y == other.y && this.color == other.color;
        }
        @Override
        public String toString() {
            return "Box (x = " + this.x + ", y = " + this.y + ", color = " + this.color + ")";
        }
    }

    public enum Color {
        W("."),
        B("#"),
        ;
        private static final Map<String, Color> MARK_MAP;
        static {
            final Map<String, Color> markMap = new HashMap<>();
            for (final Color color : values()) {
                markMap.put(color.getMark(), color);
            }
            MARK_MAP = Collections.unmodifiableMap(markMap);
        }
        private final String mark;
        Color(final String mark) {
            this.mark = mark;
        }
        public String getMark() {
            return this.mark;
        }
        public static Color byMark(final String mark) {
            return MARK_MAP.get(mark);
        }
    }

}
