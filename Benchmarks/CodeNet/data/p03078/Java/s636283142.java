import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.function.ToLongFunction;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConsoleKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 13},
   bv = {1, 0, 3},
   k = 2,
   d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\b¨\u0006\t"},
   d2 = {"abc123d", "", "args", "", "", "([Ljava/lang/String;)V", "main", "readLineList", "()[Ljava/lang/String;", "com.choruru.atcoder.main"}
)
public final class MainTemplateKt {
   public static final void main(@NotNull String[] args) {
      Intrinsics.checkParameterIsNotNull(args, "args");
      abc123d(readLineList());
   }

   @NotNull
   public static final String[] readLineList() {
      List lineList = (List)(new ArrayList());

      while(true) {
         String line = ConsoleKt.readLine();
         CharSequence var2 = (CharSequence)line;
         if (var2 == null || StringsKt.isBlank(var2)) {
            Collection $receiver$iv = (Collection)lineList;
            Object[] var10000 = $receiver$iv.toArray(new String[0]);
            if (var10000 == null) {
               throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }

            return (String[])var10000;
         }

         if (line == null) {
            Intrinsics.throwNpe();
         }

         lineList.add(line);
      }
   }

   public static final void abc123d(@NotNull String[] args) {
      Intrinsics.checkParameterIsNotNull(args, "args");
      Iterable $receiver$iv = (Iterable)StringsKt.split$default((CharSequence)args[0], new String[]{" "}, false, 0, 6, (Object)null);
      Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10)));
      Iterator var9 = $receiver$iv.iterator();

      Object item$iv$iv;
      String it;
      boolean var12;
      while(var9.hasNext()) {
         item$iv$iv = var9.next();
         it = (String)item$iv$iv;
         var12 = false;
         Integer var19 = Integer.parseInt(it);
         destination$iv$iv.add(var19);
      }

      final List xList = (List)destination$iv$iv;
      int X = ((Number)xList.get(0)).intValue();
      int Y = ((Number)xList.get(1)).intValue();
      int Z = ((Number)xList.get(2)).intValue();
      int K = ((Number)xList.get(3)).intValue();
      $receiver$iv = (Iterable)StringsKt.split$default((CharSequence)args[1], new String[]{" "}, false, 0, 6, (Object)null);
      destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10)));
      var9 = $receiver$iv.iterator();

      Long var39;
      while(var9.hasNext()) {
         item$iv$iv = var9.next();
         it = (String)item$iv$iv;
         var12 = false;
         var39 = Long.parseLong(it);
         destination$iv$iv.add(var39);
      }

      xList = CollectionsKt.sortedDescending((Iterable)((List)destination$iv$iv));
      Iterable $receiver$iv = (Iterable)StringsKt.split$default((CharSequence)args[2], new String[]{" "}, false, 0, 6, (Object)null);
      Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10)));
      Iterator var26 = $receiver$iv.iterator();

      while(var26.hasNext()) {
         Object item$iv$iv = var26.next();
         String it = (String)item$iv$iv;
         int var13 = false;
         var39 = Long.parseLong(it);
         destination$iv$iv.add(var39);
      }

      final List yList = CollectionsKt.sortedDescending((Iterable)((List)destination$iv$iv));
      Iterable $receiver$iv = (Iterable)StringsKt.split$default((CharSequence)args[3], new String[]{" "}, false, 0, 6, (Object)null);
      Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10)));
      Iterator var30 = $receiver$iv.iterator();

      while(var30.hasNext()) {
         Object item$iv$iv = var30.next();
         String it = (String)item$iv$iv;
         int var14 = false;
         var39 = Long.parseLong(it);
         destination$iv$iv.add(var39);
      }

      final List zList = CollectionsKt.sortedDescending((Iterable)((List)destination$iv$iv));
      Set indexSet = (Set)(new LinkedHashSet());
      PriorityQueue pque = new PriorityQueue(Comparator.comparingLong((ToLongFunction)(new ToLongFunction() {
         // $FF: synthetic method
         // $FF: bridge method
         public long applyAsLong(Object var1) {
            return this.applyAsLong((List)var1);
         }

         public final long applyAsLong(List elem) {
            return -(((Number)xList.get(((Number)elem.get(0)).intValue())).longValue() + ((Number)yList.get(((Number)elem.get(1)).intValue())).longValue() + ((Number)zList.get(((Number)elem.get(2)).intValue())).longValue());
         }
      })));
      pque.add(CollectionsKt.listOf(new Integer[]{0, 0, 0}));
      int cnt = 0;

      while(cnt < K) {
         Object var10000 = pque.remove();
         if (var10000 == null) {
            Intrinsics.throwNpe();
         }

         List var37 = (List)var10000;
         int xIndex = ((Number)var37.get(0)).intValue();
         int yIndex = ((Number)var37.get(1)).intValue();
         int zIndex = ((Number)var37.get(2)).intValue();
         if (!indexSet.contains("" + xIndex + '-' + yIndex + '-' + zIndex)) {
            indexSet.add("" + xIndex + '-' + yIndex + '-' + zIndex);
            long var38 = ((Number)xList.get(xIndex)).longValue() + ((Number)yList.get(yIndex)).longValue() + ((Number)zList.get(zIndex)).longValue();
            System.out.println(var38);
            if (xIndex < X - 1) {
               pque.add(CollectionsKt.listOf(new Integer[]{xIndex + 1, yIndex, zIndex}));
            }

            if (yIndex < Y - 1) {
               pque.add(CollectionsKt.listOf(new Integer[]{xIndex, yIndex + 1, zIndex}));
            }

            if (zIndex < Z - 1) {
               pque.add(CollectionsKt.listOf(new Integer[]{xIndex, yIndex, zIndex + 1}));
            }

            ++cnt;
         }
      }

   }
}
